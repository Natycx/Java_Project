package Secao_18.Exercises.entities;

import java.util.Objects;

public class Curso {

    private int code;

    public Curso(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return code == curso.code;
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }
}
