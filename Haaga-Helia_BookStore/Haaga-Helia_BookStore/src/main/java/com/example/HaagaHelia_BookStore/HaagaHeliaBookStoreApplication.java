package com.example.HaagaHelia_BookStore;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.HaagaHelia_BookStore.Domain.Book;
import com.example.HaagaHelia_BookStore.Domain.Category;
import com.example.HaagaHelia_BookStore.Domain.User;
import com.example.HaagaHelia_BookStore.Domain.BookRepository;
import com.example.HaagaHelia_BookStore.Domain.CategoryRepository;
import com.example.HaagaHelia_BookStore.Domain.Cd;
import com.example.HaagaHelia_BookStore.Domain.CdRepository;
import com.example.HaagaHelia_BookStore.Domain.UserRepository;

@SpringBootApplication
public class HaagaHeliaBookStoreApplication {

	private static final Logger log = LoggerFactory.getLogger(HaagaHeliaBookStoreApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(HaagaHeliaBookStoreApplication.class, args);
	}

	@Bean
	public CommandLineRunner BookstoreDemo(BookRepository bRepository, CategoryRepository cRepository,
			UserRepository uRepository, CdRepository cdRepository) {
		return (args) -> {

			Category category0 = new Category("");

			Category category1 = new Category("Fantasy");
			Category category2 = new Category("Mystery");
			Category category3 = new Category("Romance");
			Category category4 = new Category("Thriller");
			Category category5 = new Category("Biography");
			Category category6 = new Category("Historical Fiction");
			Category category7 = new Category("Crime");
			Category category8 = new Category("Young Adult");
			Category category9 = new Category("Self-Help");
			Category category10 = new Category("Science");
			Category category11 = new Category("Poetry");
			Category category12 = new Category("Cooking");
			Category category13 = new Category("Travel");
			Category category14 = new Category("Fantasy");
			Category category15 = new Category("Science Fiction");
			Category category16 = new Category("Historical Fiction");
			Category category17 = new Category("Humor");
			Category category18 = new Category("Classic");

			cRepository.save(category1);
			cRepository.save(category2);
			cRepository.save(category3);
			cRepository.save(category4);
			cRepository.save(category5);
			cRepository.save(category6);
			cRepository.save(category7);
			cRepository.save(category8);
			cRepository.save(category9);
			cRepository.save(category10);
			cRepository.save(category11);
			cRepository.save(category12);
			cRepository.save(category13);
			cRepository.save(category14);
			cRepository.save(category15);
			cRepository.save(category16);
			cRepository.save(category17);
			cRepository.save(category18);

			bRepository.save(new Book("J.K. Rowling", "Harry Potter and the Philosopher's Stone", "9780747532743", 1997,
					4, category1));
			bRepository.save(
					new Book("Agatha Christie", "Murder on the Orient Express", "9780007525300", 1934, 4, category2));
			bRepository.save(new Book("Jane Austen", "Pride and Prejudice", "9780141439518", 1813, 5, category3));
			bRepository.save(new Book("Dan Brown", "The Da Vinci Code", "9780307474278", 2003, 4, category4));
			bRepository.save(new Book("Walter Isaacson", "Steve Jobs", "9781451648539", 2011, 5, category5));
			bRepository.save(new Book("Ken Follett", "The Pillars of the Earth", "9780451488336", 1989, 5, category6));
			bRepository.save(new Book("Gillian Flynn", "Gone Girl", "9780307588371", 2012, 4, category7));
			bRepository.save(new Book("J.D. Salinger", "The Catcher in the Rye", "9780316769488", 1951, 4, category8));
			bRepository.save(new Book("Dale Carnegie", "How to Win Friends and Influence People", "9780671027032", 1936,
					5, category9));
			bRepository.save(new Book("Carl Sagan", "Cosmos", "9780345331359", 1980, 5, category10));
			bRepository.save(new Book("Rupi Kaur", "Milk and Honey", "9781449474256", 2014, 4, category11));
			bRepository.save(new Book("Jamie Oliver", "Jamie's 30-Minute Meals", "9780718154776", 2010, 5, category12));
			bRepository.save(new Book("Bill Bryson", "In a Sunburned Country", "9780767903868", 2000, 4, category13));
			bRepository.save(new Book("George R.R. Martin", "A Game of Thrones", "9780553593716", 1996, 5, category14));
			bRepository.save(new Book("Philip K. Dick", "Do Androids Dream of Electric Sheep?", "9780345404473", 1968,
					4, category15));
			bRepository.save(new Book("Margaret Atwood", "The Handmaid's Tale", "9780385490818", 1985, 5, category16));
			bRepository.save(new Book("Terry Pratchett", "Good Omens", "9780060853983", 1990, 4, category17));
			bRepository.save(new Book("Jane Austen", "Sense and Sensibility", "9780141439662", 1811, 5, category18));
			bRepository.save(new Book("Harper Lee", "To Kill a Mockingbird", "9780061120084", 1960, 5, category18));
			bRepository.save(new Book("Gabriel García Márquez", "One Hundred Years of Solitude", "9780060883287", 1967,
					5, category5));
			bRepository.save(new Book("F. Scott Fitzgerald", "The Great Gatsby", "9780743273565", 1925, 5, category18));
			bRepository.save(new Book("Markus Zusak", "The Book Thief", "9780375842207", 2005, 4, category8));
			bRepository.save(new Book("Leo Tolstoy", "Anna Karenina", "9780143035008", 1878, 5, category18));
			bRepository.save(new Book("Arthur Conan Doyle", "The Adventures of Sherlock Holmes", "9780451524934", 1892,
					5, category2));
			bRepository.save(new Book("Khaled Hosseini", "The Kite Runner", "9781573222457", 2003, 5, category5));
			bRepository.save(new Book("J.R.R. Tolkien", "The Lord of the Rings", "9780618640157", 1954, 5, category14));
			bRepository.save(new Book("Haruki Murakami", "Norwegian Wood", "9780375704024", 1987, 4, category16));
			bRepository.save(
					new Book("Ernest Hemingway", "The Old Man and the Sea", "9780684801223", 1952, 4, category18));
			bRepository.save(new Book("Ray Bradbury", "Fahrenheit 451", "9781451673319", 1953, 4, category15));
			bRepository.save(new Book("Gillian Flynn", "Sharp Objects", "9780307351487", 2006, 4, category7));
			bRepository.save(new Book("Margaret Atwood", "Alias Grace", "9780385490443", 1996, 4, category16));
			bRepository.save(new Book("Jhumpa Lahiri", "The Namesake", "9780618485222", 2003, 4, category5));
			bRepository.save(new Book("Toni Morrison", "Beloved", "9781400033416", 1987, 5, category5));
			bRepository.save(new Book("Mika Waltari", "Sinuhe egyptiläinen", "9789510350598", 1945, 5, category18));
			bRepository.save(new Book("Arto Paasilinna", "Jäniksen vuosi", "9789510274856", 1975, 4, category17));
			bRepository.save(new Book("Väinö Linna", "Tuntematon sotilas", "9789510392376", 1954, 5, category18));
			bRepository.save(new Book("Sofi Oksanen", "Puhdistus", "9789510338565", 2008, 4, category18));
			bRepository.save(new Book("Tove Jansson", "Muumipappa ja meri", "9789510353827", 1965, 5, category1));
			bRepository.save(new Book("Jo Nesbø", "The Snowman", "9780307742995", 2007, 4, category2));
			bRepository.save(new Book("Fredrik Backman", "A Man Called Ove", "9781476738017", 2012, 5, category5));
			bRepository.save(new Book("Jenny Erpenbeck", "Go, Went, Gone", "9780811225946", 2015, 4, category18));
			bRepository.save(new Book("Kari Hotakainen", "Juoksuhaudantie", "9789510326265", 2002, 4, category18));
			bRepository.save(new Book("Ilkka Remes", "Pääkallokehrääjä", "9789510319090", 2000, 4, category4));
			bRepository.save(new Book("Minna Canth", "Työmiehen vaimo", "9789510391737", 1885, 5, category18));
			bRepository.save(new Book("Sofi Oksanen", "Kun kyyhkyset katosivat", "9789510410780", 2012, 4, category18));
			bRepository.save(new Book("Mikko Rimminen", "Pussikaljaromaani", "9789510369842", 2001, 4, category17));
			bRepository.save(
					new Book("Arto Paasilinna", "Hurmaava joukkoitsemurha", "9789510238049", 1989, 4, category17));
			bRepository.save(new Book("Elias Lönnrot", "Kalevala", "9789510334925", 1835, 5, category18));
			bRepository.save(new Book("Sofi Oksanen", "Kun kyyhkyset katosivat", "9789510410780", 2012, 4, category18));
			bRepository.save(new Book("Tuomas Kyrö", "Mielensäpahoittaja", "9789511329200", 2010, 4, category17));
			bRepository.save(new Book("Leena Lander", "Hänen olivat linnut", "9789510242121", 1986, 4, category18));
			bRepository.save(new Book("Tove Jansson", "Muumilaakson marraskuu", "9789510426774", 1970, 5, category1));
			bRepository.save(new Book("Sirpa Kähkönen", "Graniittimies", "9789526319354", 2005, 4, category18));
			bRepository.save(new Book("Matti Yrjänä Joensuu", "Harjunpää ja rakkauden nälkä", "9789510297329", 1985, 4,
					category7));
			bRepository.save(new Book("Mika Waltari", "The Egyptian", "9780156028030", 1945, 5, category18));
			bRepository.save(new Book("Riikka Pulkkinen", "Raja", "9789510428921", 2006, 4, category16));
			bRepository.save(
					new Book("Johanna Sinisalo", "Ennen päivänlaskua ei voi", "9789510452445", 2000, 4, category16));
			bRepository.save(new Book("Arto Paasilinna", "Hirttämättömät", "9789510234515", 1984, 4, category17));
			bRepository.save(new Book("Elias Lönnrot", "Kanteletar", "9789510394646", 1840, 5, category18));
			bRepository.save(new Book("Riikka Pulkkinen", "Totta", "9789510317645", 2013, 4, category16));
			bRepository.save(new Book("Sofi Oksanen", "Norma", "9789510428396", 2015, 4, category18));
			bRepository.save(new Book("J.K. Rowling", "Harry Potter and the Chamber of Secrets", "9780747538493", 1998,
					4, category1));
			bRepository
					.save(new Book("Agatha Christie", "And Then There Were None", "9780062073488", 1939, 5, category2));
			bRepository.save(new Book("Jane Austen", "Emma", "9780141439587", 1815, 4, category3));
			bRepository.save(new Book("Dan Brown", "Angels & Demons", "9780743493468", 2000, 4, category4));
			bRepository.save(new Book("Walter Isaacson", "Einstein: His Life and Universe", "9780743264745", 2007, 5,
					category5));
			bRepository.save(new Book("Ken Follett", "World Without End", "9780451228376", 2007, 4, category6));
			bRepository.save(new Book("Gillian Flynn", "Dark Places", "9780307341570", 2009, 4, category7));
			bRepository.save(new Book("J.D. Salinger", "Franny and Zooey", "9780316769495", 1961, 4, category8));
			bRepository.save(new Book("Dale Carnegie", "How to Stop Worrying and Start Living", "9780671035976", 1948,
					4, category9));
			bRepository.save(new Book("Carl Sagan", "Contact", "9780671004101", 1985, 5, category10));
			bRepository.save(new Book("Rupi Kaur", "The Sun and Her Flowers", "9781449486792", 2017, 4, category11));
			bRepository.save(new Book("Jamie Oliver", "Jamie's Italy", "9780718147709", 2005, 4, category12));
			bRepository
					.save(new Book("Bill Bryson", "Notes from a Small Island", "9780380727506", 1995, 5, category13));
			bRepository.save(new Book("George R.R. Martin", "A Clash of Kings", "9780553579901", 1998, 5, category14));
			bRepository.save(
					new Book("Philip K. Dick", "The Man in the High Castle", "9780679740674", 1962, 4, category15));
			bRepository.save(new Book("Margaret Atwood", "Oryx and Crake", "9780385721677", 2003, 5, category16));
			bRepository.save(new Book("Terry Pratchett", "Mort", "9780062225727", 1987, 4, category17));
			bRepository.save(new Book("Jane Austen", "Northanger Abbey", "9780141439792", 1817, 5, category18));
			bRepository.save(new Book("Harper Lee", "Go Set a Watchman", "9780062409850", 2015, 4, category18));
			bRepository.save(new Book("Gabriel García Márquez", "Love in the Time of Cholera", "9780307389732", 1985, 5,
					category5));
			bRepository
					.save(new Book("F. Scott Fitzgerald", "Tender Is the Night", "9780141194066", 1934, 4, category18));
			bRepository.save(new Book("Markus Zusak", "Bridge of Clay", "9781984898587", 2018, 4, category8));
			bRepository.save(new Book("Leo Tolstoy", "War and Peace", "9780143035008", 1869, 5, category18));
			bRepository.save(new Book("Arthur Conan Doyle", "The Hound of the Baskervilles", "9780143105439", 1902, 5,
					category2));
			bRepository
					.save(new Book("Khaled Hosseini", "A Thousand Splendid Suns", "9781594489501", 2007, 5, category5));
			bRepository.save(new Book("J.R.R. Tolkien", "The Hobbit", "9780618260300", 1937, 5, category14));
			bRepository.save(new Book("Haruki Murakami", "Kafka on the Shore", "9781400079278", 2002, 4, category16));
			bRepository.save(
					new Book("Ernest Hemingway", "For Whom the Bell Tolls", "9780684803357", 1940, 4, category18));
			bRepository.save(new Book("Ray Bradbury", "The Martian Chronicles", "9781451678192", 1950, 4, category15));
			bRepository.save(new Book("Gillian Flynn", "The Grownup", "9780804188975", 2015, 4, category7));
			bRepository.save(new Book("Margaret Atwood", "The Blind Assassin", "9780385720953", 2000, 4, category16));
			bRepository.save(new Book("Jhumpa Lahiri", "Interpreter of Maladies", "9780395927205", 1999, 4, category5));
			bRepository.save(new Book("Toni Morrison", "Song of Solomon", "9781400033423", 1977, 5, category5));
			bRepository.save(new Book("Mika Waltari", "The Roman", "9780060956707", 1966, 5, category18));
			bRepository.save(new Book("Arto Paasilinna", "The Year of the Hare", "9780141394281", 1975, 5, category17));
			bRepository.save(new Book("Väinö Linna", "Under the North Star", "9789510218966", 1960, 5, category18));
			bRepository
					.save(new Book("Sofi Oksanen", "When the Doves Disappeared", "9780802122997", 2012, 4, category18));
			bRepository.save(new Book("Tove Jansson", "Moominvalley in November", "9780140317026", 1970, 5, category1));
			bRepository.save(new Book("Jo Nesbø", "The Redbreast", "9780061133985", 2000, 4, category2));
			Category category19 = new Category("Pop");
			Category category20 = new Category("Rock");
			Category category21 = new Category("Trance");
			Category category22 = new Category("Electronic");
			Category category23 = new Category("Hip Hop");
			Category category24 = new Category("Jazz");
			Category category25 = new Category("Blues");
			Category category26 = new Category("Reggae");
			Category category27 = new Category("Country");
			Category category28 = new Category("Metal");
			Category category29 = new Category("Punk");
			Category category30 = new Category("R&B");
			Category category31 = new Category("Soul");
			Category category32 = new Category("Folk");
			Category category33 = new Category("Classical");
			Category category34 = new Category("Opera");
			Category category35 = new Category("World");
			Category category36 = new Category("Alternative");
			Category category37 = new Category("Indie");
			Category category38 = new Category("Gospel");
			Category category39 = new Category("New Age");
			Category category40 = new Category("Disco");
			Category category41 = new Category("Techno");
			Category category42 = new Category("House");
			Category category43 = new Category("Ambient");
			Category category44 = new Category("Chillout");
			Category category45 = new Category("Trap");
			Category category46 = new Category("Dancehall");
			Category category47 = new Category("Ska");
			Category category48 = new Category("Dubstep");
			Category category49 = new Category("Drum and Bass");
			Category category50 = new Category("Hardcore");

			// Tallennetaan kategoriat tietokantaan
			cRepository.saveAll(List.of(
					category19, category20, category21, category22, category23, category24,
					category25, category26, category27, category28, category29, category30,
					category31, category32, category33, category34, category35, category36,
					category37, category38, category39, category40, category41, category42,
					category43, category44, category45, category46, category47, category48,
					category49, category50));
			// Luodaan lisää CD-levyjä eri kategorioilla
			cdRepository
					.save(new Cd("Queen", "Bohemian Rhapsody", "A Night at the Opera", "5678", 1975, 12, category20)); // Rock
			cdRepository.save(
					new Cd("Armin van Buuren", "This Is What It Feels Like", "Intense", "91011", 2013, 10, category21)); // Trance
			cdRepository
					.save(new Cd("Daft Punk", "Get Lucky", "Random Access Memories", "121314", 2013, 13, category22)); // Electronic
			cdRepository.save(new Cd("Kanye West", "Stronger", "Graduation", "151617", 2007, 14, category23)); // Hip
																												// Hop
			cdRepository.save(new Cd("Miles Davis", "So What", "Kind of Blue", "181920", 1959, 9, category24)); // Jazz
			cdRepository
					.save(new Cd("B.B. King", "The Thrill Is Gone", "Completely Well", "212223", 1969, 11, category25)); // Blues
			cdRepository.save(new Cd("Bob Marley", "No Woman, No Cry", "Natty Dread", "242526", 1974, 8, category26)); // Reggae
			cdRepository.save(new Cd("Johnny Cash", "Ring of Fire", "Ring of Fire: The Best of Johnny Cash", "272829",
					1963, 10, category27)); // Country
			cdRepository.save(new Cd("Metallica", "Enter Sandman", "Metallica", "303132", 1991, 15, category28)); // Metal
			cdRepository.save(new Cd("Ramones", "Blitzkrieg Bop", "Ramones", "333435", 1976, 12, category29)); // Punk
			cdRepository.save(new Cd("Rihanna", "Umbrella", "Good Girl Gone Bad", "363738", 2007, 11, category30)); // R&B
			cdRepository.save(new Cd("Aretha Franklin", "Respect", "I Never Loved a Man the Way I Love You", "394041",
					1967, 10, category31)); // Soul
			cdRepository.save(new Cd("Bob Dylan", "Like a Rolling Stone", "Highway 61 Revisited", "424344", 1965, 14,
					category32)); // Folk
			cdRepository.save(new Cd("Ludwig van Beethoven", "Symphony No. 5", "Symphony No. 5 in C minor", "454647",
					1808, 18, category33)); // Classical
			cdRepository.save(new Cd("Luciano Pavarotti", "Nessun Dorma", "Turandot", "484950", 1990, 9, category34));
			cdRepository.save(new Cd("Elvis Presley", "Can't Help Falling in Love", "Blue Hawaii", "515253", 1961, 10,
					category35)); // World
			cdRepository
					.save(new Cd("Nirvana", "Smells Like Teen Spirit", "Nevermind", "545556", 1991, 13, category36)); // Alternative
			cdRepository.save(new Cd("The Smiths", "There Is a Light That Never Goes Out", "The Queen Is Dead",
					"575859", 1986, 11, category37)); // Indie
			cdRepository.save(new Cd("Mahalia Jackson", "How I Got Over", "Gospels, Spirituals, & Hymns", "606162",
					1956, 9, category38)); // Gospel
			cdRepository.save(new Cd("Enya", "Orinoco Flow", "Watermark", "636465", 1988, 12, category39)); // New Age
			cdRepository
					.save(new Cd("Bee Gees", "Stayin' Alive", "Saturday Night Fever", "666768", 1977, 11, category40)); // Disco
			cdRepository.save(new Cd("The Chemical Brothers", "Block Rockin' Beats", "Dig Your Own Hole", "697071",
					1997, 12, category41)); // Techno
			cdRepository.save(new Cd("Fatboy Slim", "Praise You", "You've Come a Long Way, Baby", "727374", 1998, 10,
					category42)); // House
			cdRepository.save(new Cd("Brian Eno", "An Ending (Ascent)", "Apollo: Atmospheres and Soundtracks", "757677",
					1983, 9, category43)); // Ambient
			cdRepository.save(new Cd("Moby", "Porcelain", "Play", "787980", 1999, 10, category44)); // Chillout
			cdRepository.save(new Cd("Future", "Mask Off", "Future", "818283", 2017, 13, category45)); // Trap
			cdRepository.save(new Cd("Sean Paul", "Temperature", "The Trinity", "848586", 2005, 10, category46)); // Dancehall
			cdRepository.save(new Cd("The Specials", "Ghost Town", "The Specials", "878889", 1981, 11, category47)); // Ska
			cdRepository.save(new Cd("Skrillex", "Scary Monsters and Nice Sprites", "Scary Monsters and Nice Sprites",
					"909192", 2010, 12, category48));
			cdRepository.save(new Cd("LTJ Bukem", "Horizons", "Logical Progression", "939495", 1996, 10, category49));
			// and
			// Bass
			cdRepository.save(new Cd("Bad Religion", "21st Century (Digital Boy)", "Stranger Than Fiction", "969798",
					1994, 11, category50));
			uRepository.save(new User("user", "$2a$06$3jYRJrg0ghaaypjZ/.g4SethoeA51ph3UD4kZi9oPkeMTpjKU5uo6", "USER",
					"user@bookstore.fi"));
			uRepository.save(new User("admin", "$2a$10$0MMwY.IQqpsVc1jC8u7IJ.2rT8b0Cd3b3sfIBGV2zfgnPGtT4r0.C", "ADMIN",
					"admin@bookstore.fi"));

			for (Book book : bRepository.findAll()) {
				log.info(book.toString());
			}
		};

	}
}
