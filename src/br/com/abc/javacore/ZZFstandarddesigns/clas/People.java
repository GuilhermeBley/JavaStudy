package br.com.abc.javacore.ZZFstandarddesigns.clas;

public class People {
    private String name;
    private String middleName;
    private String lastName;
    private String nickName;
    private String fatherName;

    public People() {
    }

    private People(String name, String middleName, String lastName, String nickName, String fatherName) {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.nickName = nickName;
        this.fatherName = fatherName;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nickName='" + nickName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                '}';
    }

    public static class PeopleBuilder{
        private String name;
        private String middleName;
        private String lastName;
        private String nickName;
        private String fatherName;

        public PeopleBuilder(String name) {
            this.name = name;
        }

        public PeopleBuilder name (String name){
            this.name = name;
            return this;
        }

        public PeopleBuilder middleName (String middleName){
            this.middleName = middleName;
            return this;
        }

        public PeopleBuilder lastName (String lastName){
            this.lastName = lastName;
            return this;
        }

        public PeopleBuilder nickName (String nickName){
            this.nickName = nickName;
            return this;
        }

        public PeopleBuilder fatherName (String fatherName){
            this.fatherName = fatherName;
            return this;
        }

        public People build(){
            return new People(name, middleName, lastName, nickName, fatherName);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }
}
