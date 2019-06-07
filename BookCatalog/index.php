<?php
    require_once('database.php');
    
    $results_per_page = 6;
    
    $sql ='SELECT course.courseID, course.courseTitle, course.credit, coursebook.book, book.bookTitle, book.price
                            FROM course, coursebook, book
                                WHERE course.courseID = coursebook.course AND book.isbn13 = coursebook.book';
    
    
    $statement1 = $db->prepare($sql);
    $statement1->execute();
    $book_catalog = $statement1->fetchAll();
    $number_of_results = count($book_catalog);
    
    
    $number_of_pages = ceil($number_of_results / $results_per_page);
    
    if(!isset($_GET['page'])){
        $page = 1;
    }
    else{
        $page = $_GET['page'];
    }
    
    $this_page_first_result = ($page - 1) * $results_per_page;
    
    $sql ='SELECT course.courseID, course.courseTitle, course.credit, coursebook.book, book.bookTitle, book.price
                            FROM course, coursebook, book
                                WHERE course.courseID = coursebook.course AND book.isbn13 = coursebook.book LIMIT ' . $this_page_first_result
                                    . ',' . $results_per_page;
    
    $statement1 = $db->prepare($sql);
    $statement1->execute();
    $book_catalog = $statement1->fetchAll();
    $statement1->closeCursor();
    

    if(isset($_GET['order']) && isset($_GET['sort'])){
        $sort = 'ORDER BY ' . $_GET['order'] . ' ' . $_GET['sort'];
        
                
    }
    else{
        $sort = '';
    }
        
    $sql ='SELECT course.courseID, course.courseTitle, course.credit, coursebook.book, book.bookTitle, book.price
        FROM course, coursebook, book
              WHERE course.courseID = coursebook.course AND book.isbn13 = coursebook.book ' . $sort . ' LIMIT ' . $this_page_first_result
                          . ',' . $results_per_page;
    
    $statement1 = $db->prepare($sql);
    $statement1->execute();
    $book_catalog = $statement1->fetchAll();
    $statement1->closeCursor();
    
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
        <h1>CIS Department Book Catalog</h1>
        <section>
            <table>
                <tr>
                    <th><a href="?order=courseID&&sort=ASC"/>Course #</th>
                    <th>Course Title</th>
                    <th>Book Image</th>
                    <th>Book Title</th>
                    <th><a href="?order=price&&sort=ASC"/>Price</th>
                </tr>
                    <?php foreach($book_catalog as $course) : ?>
                <tr>
                    <td><a href="http://www.cpp.edu/~cba/computer-information-systems/curriculum/courses.shtml"><?php echo $course[0]; ?></a></td>
                    <td><?php echo $course[1] . "(" . $course[2] . ")"; ?></td>
                    <td><a href="http://localhost/BookCatalog/book_details.php?courseID=<?php echo $course[0]; ?>&&courseTitle=<?php echo $course[1]; ?>&&credit=<?php echo $course[2]; ?>&&book=<?php echo $course[3]; ?>&&bookTitle=<?php echo urlencode($course[4]); ?>&&price=<?php echo $course[5]; ?>"><img src="http://localhost/BookCatalog/images/<?php echo $course[3]; ?>.jpg"/></a></td>
                    <td><?php echo $course[4]; ?></td>
                    <td><?php echo '$'. number_format($course[5],2); ?></td>
                </tr>
                <?php endforeach; ?>
            </table>
                <?php for($page = 1; $page <= $number_of_pages; $page++){
                        if(isset($_GET['order']) && isset($_GET['sort'])){
                            $sort = 'ORDER BY ' . $_GET['order'] . ' ' . $_GET['sort'];
                            echo '<a href="http://localhost/BookCatalog/index.php?order=' . ($_GET['order']) . '&&sort=ASC&&page=' . $page . '">' . '  ' . $page . '  ' . '</a>';

                        }
                        else{
                            echo '<a href="http://localhost/BookCatalog/index.php?page=' . $page . '">' . '  ' . $page . '  ' . '</a>';
                        }   
                } ?>
        </section>
    </center>
    </body>
</main>
</html>
