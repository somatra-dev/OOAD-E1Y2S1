package builder_pattern;


import lombok.ToString;

import java.util.List;
import java.util.UUID;

@ToString
class Author {
    private Integer id;
    private String uuid;
    private String name;
    private String profile;
    private String dataOfBirth;
    public Author(AuthorBuilder builder) {
        this.id = builder.id;
        this.uuid = builder.uuid;
        this.name = builder.name;
        this.profile = builder.profile;
        this.dataOfBirth = builder.dataOfBirth;
    }

    static class AuthorBuilder{
        private Integer id;
        private String uuid;
        private String name;
        private String profile;
        private String dataOfBirth;
        public AuthorBuilder(){}

        public AuthorBuilder id(Integer id){
            this.id = id;
            return this;
        }
        public AuthorBuilder uuid(String uuid){
            this.uuid = uuid;
            return this;
        }
        public AuthorBuilder name(String name){
            this.name = name;
            return this;
        }
        public AuthorBuilder profile(String profile){
            this.profile = profile;
            return this;
        }
        public AuthorBuilder dataOfBirth(String dataOfBirth){
            this.dataOfBirth = dataOfBirth;
            return this;
        }
        public Author build(){
            return new Author(this);
        }
    }

}

// Movie
@ToString
class Movie {
    private Integer id;
    private String uuid;
    private String title;
    private String description;
    private String releaseDate;
    private List<String> images;
    private List<Author> authors;

    public Movie(MovieBuilder builder) {
        this.id = builder.id;
        this.uuid = builder.uuid;
        this.title = builder.title;
        this.description = builder.description;
        this.releaseDate = builder.releaseDate;
        this.images = builder.images;
        this.authors = builder.authors;
    }

    static class MovieBuilder{
        private Integer id;
        private String uuid;
        private String title;
        private String description;
        private String releaseDate;
        private List<String> images;
        private List<Author> authors;

        public MovieBuilder(){}

        public MovieBuilder id(Integer id){
            this.id = id;
            return this;
        }
        public MovieBuilder uuid(String uuid){
            this.uuid = uuid;
            return this;
        }

        public MovieBuilder title(String title){
            this.title = title;
            return this;
        }

        public MovieBuilder description(String description){
            this.description = description;
            return this;
        }
        public MovieBuilder releaseDate(String releaseDate){
            this.releaseDate = releaseDate;
            return this;
        }
        public MovieBuilder images(List<String> images){
            this.images = images;
            return this;
        }
        public MovieBuilder authors(List<Author> authors){
            this.authors = authors;
            return this;
        }
        public Movie build(){
            return new Movie(this);
        }
    }
}


public class ClassWork {

    public static void main(String[] args) {

        Author author = new Author.AuthorBuilder()
                .id(1)
                .uuid(UUID.randomUUID().toString())
                .name("Koko")
                .build();

//        System.out.println(author);

        Movie movie = new Movie.MovieBuilder()
                .id(1)
                .uuid(UUID.randomUUID().toString())
                .title("Jame Movie")
                .authors(List.of(author))
                .releaseDate("2025-01-10")
                .build();

        System.out.println(movie);

    }

}
