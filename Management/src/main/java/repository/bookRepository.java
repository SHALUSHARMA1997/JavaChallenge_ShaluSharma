package repository;

	import java.util.List;

	import org.springframework.data.jpa.repository.JpaRepository;

	import.Management.entity.Book;

	public interface bookRepository extends JpaRepository<Book, Integer> {

		List<Book> findByNameContainsAndAuthorContainsAllIgnoreCase(String name,String author);
		
	}



