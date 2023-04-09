package Builder;

public class User {

    private String name;
    private String surname;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public User(Builder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public static class Builder {
        private String name;
        private String surname;

        public Builder() {

        }

        public static Builder builder()
        {
            return new Builder();
        }
        public Builder setName(String name) {
            this.name = name;
            return this;
        }
        public Builder setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }
}


