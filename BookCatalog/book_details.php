<?php
    require_once('database.php');
    
    if(isset($_GET['courseID']) && isset($_GET['courseTitle']) && isset($_GET['credit']) && isset($_GET['book']) && isset($_GET['bookTitle']) && isset($_GET['price'])){
        $course_id = filter_input(INPUT_GET,'courseID');
        $course_title = filter_input(INPUT_GET,'courseTitle');
        $credit = filter_input(INPUT_GET,'credit',FILTER_VALIDATE_INT);
        $book = filter_input(INPUT_GET,'book');
        $book_title = urldecode(filter_input(INPUT_GET,'bookTitle'));
        $price= filter_input(INPUT_GET,'price',FILTER_VALIDATE_FLOAT);
    }
    else{
          
       echo 'Error: Book information not retreived!';    
    }
        
    $book_description_sql ='SELECT publisher.publisher, book.edition, book.publishDate, book.length, book.description
            FROM book, course, publisher
                WHERE course.courseID = ' . "'" . $course_id . "'" . ' AND book.isbn13 = ' . $book . ' AND publisher.publisherID = book.publisher';
    
    $book_authors_sql = 'SELECT author.firstName, author.lastName
                            FROM author, authorbook
                                WHERE authorbook.book = ' . $book .' AND authorbook.author = author.authorID;';
    
    $statement1 = $db->prepare($book_description_sql);
    $statement1->execute();
    $books_description = $statement1->fetchAll();    
    
    $statement2 = $db->prepare($book_authors_sql);
    $statement2->execute();
    $book_authors = $statement2->fetchAll();
    
    $statement1->closeCursor();
    $statement2->closeCursor();   
    
?>

<!DOCTYPE html>
<html>
    <head>
        <style>
            table, td{
                color: black;
                border: 1px solid black;
                border-collapse: collapse;
            }
            th{
                color: black;
                border: 1px solid black;
                border-collapse: collapse;
                background-color: lightblue;
            }
        </style>
        <title>CIS Book Catalog</title>
        <link rel="stylesheet" type="text/css" href="main.css" />
    </head>
    <body>
    <center>
        <main>
        <h1>Book Description</h1>
        <section>
            <table>
                <tr>
                    <td><img src="http://localhost/BookCatalog/images/<?php echo $book; ?>.jpg"/></td>
                    <td>
                        <p>For course:  <?php echo $course_id . ' ' . $course_title . ' ' . '(' . $credit . ')'  ?></p>
                        <p>Book Title: <?php echo $book_title ?></p>
                        <p>Price: <?php echo number_format($price,2) ?></p>
                        <p>Authors: <?php $author_out = array(); foreach($book_authors as $book_author) : ?><?php array_push($author_out, $book_author['firstName'] . ' ' . $book_author['lastName']); ?> <?php endforeach;?><?php echo implode(', ', $author_out) ?>
                        <p>Publisher: <?php foreach($books_description as $book_publisher){ echo $book_publisher[0]; } ?></p>
                        <p>Edition: <?php foreach($books_description as $book_edition){echo $book_edition[1] . ' edition ' . ' (' . $book_edition[2] . ')';} ?></p>
                        <p>Length: <?php foreach($books_description as $book_length){echo $book_length[3] . ' pages';} ?></p>
                        <p>ISBN-13: <?php echo $book ?></p>
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                             <p>Product Description: <?php foreach($books_description as $book_description){echo nl2br( "\n $book_description[4]");} ?></p>
                    </td>
                </tr>
            </table>   
        </section>
    </center>
    </body>
</main>
</html>
