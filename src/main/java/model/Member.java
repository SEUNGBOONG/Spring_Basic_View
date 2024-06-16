package model;

public class Member {
    private final Long id;
    private final String name;
    private final Grade grade;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Grade getGrade() {
        return grade;
    }

    public Member(final Long id, final String name, final Grade grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }
}
