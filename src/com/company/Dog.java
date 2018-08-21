package com.company;

public class Dog {
    private String Imie;
    private String Rasa;

    public String getImie()
    {
        return Imie;
    }
    public String getrasa()
    {
        return Rasa;
    }

    public void setimie(String Imie)
    {
        this.Imie=Imie;
    }

    public String toString()
    {
        return "Pies nazywa się "+Imie+" jest rasy "+Rasa;
    }
    public Dog(String Imie, String Rasa)
    {
        this.Imie=Imie;
        this.Rasa=Rasa;
    }
}
