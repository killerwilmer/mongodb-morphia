package com.killerwilmer.app.mongodbmorphia;

import com.killerwilmer.app.mongodbmorphia.entity.Author;
import com.killerwilmer.app.mongodbmorphia.entity.Book;
import com.killerwilmer.app.mongodbmorphia.repository.AuthorRepository;
import com.killerwilmer.app.mongodbmorphia.repository.BookRepository;
import dev.morphia.query.Query;
import dev.morphia.query.UpdateOperations;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class MongodbMorphiaApplication {

	public static void main(String[] args) {
		final ApplicationContext ctx = SpringApplication.run(MongodbMorphiaApplication.class, args);

		final BookRepository bookRepo = ctx.getBean(BookRepository.class);
		final AuthorRepository authorRepo = ctx.getBean(AuthorRepository.class);

		final Book ci = new Book("Continous Integration", LocalDate.now());
		bookRepo.create(ci);

		final Author julius = new Author("Julius");
		julius.setBooks(Stream.of(ci).collect(Collectors.toSet()));
		authorRepo.create(julius);

		final Author read = authorRepo.read(julius.getId());

		final Query<Author> updateQuery = authorRepo.createQuery().filter("id =", julius.getId());

		final UpdateOperations<Author> ops = authorRepo.createOperations().set("name", "Portia");
		// authorRepo.update(read, ops);
		authorRepo.update(updateQuery, ops);

		read.setName("Abeiku");
		authorRepo.create(read);

		authorRepo.delete(julius);
	}

}
