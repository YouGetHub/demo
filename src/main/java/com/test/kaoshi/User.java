package com.test.kaoshi;

import java.util.Objects;

public class User {
    public String name;
    public String book;
    public int count;

    @Override
    public String toString() {
        return "User{" +
                "book='" + book + '\'' +
                ", count=" + count * 20 +
                '}';
    }

    public User() {
    }

    public User(String name, String book, int count) {
        this.name = name;
        this.book = book;
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return count == user.count &&
                Objects.equals(book, user.book);
    }

    @Override
    public int hashCode() {
        return Objects.hash(book, count);
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
