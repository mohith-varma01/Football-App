package com.example.favouritefootballer;

public class FootballerExpert
{
    final Integer[] images = {
            R.drawable.cr7, R.drawable.me,
            R.drawable.ibra, R.drawable.messi,
            R.drawable.neymar, R.drawable.ozil,
            R.drawable.ramos
    };

    final String[] names = {
            " Cristiano Ronaldo", " Cristiano Ronaldo",
            " Zlatan Ibrahimovic", " Leo Messi",
            " Neymar Jr", " Mesut Ozil",
            " Sergio Ramos"
    };

    final String[] listOfDescriptions = {
            "Cristiano Ronaldo:\n\n-5 Ballan'dors\n\n-5 Champions League titles\n\n-Real Madrid top scorer with 450 goals\n\nThere is no record without him breaking it\n\nInyen beku nimge?",
            "Cristiano Ronaldo(Again):\n\n-All time top scorer in GFC with 1156 goals\n\n-Highest number of Hat tricks in GFC\n\n-Highest number of Assists in GFC with 998 assists\n\nGFC-Gully Football Championship",
            "Zlatan Ibrahimovic:\n\n-Played with all the teams in europe\n\n-Has his own category of jokes\n(example: When Zlatan took up a lie detector test, the machine confessed everything)\n\n-GOD",
            "Lionel Messi:\n\n-Rumoured to leave barca after every season but never actually leaves\n\n-Nothing much to be told about as everyone knows about this legend",
            "Neymar Jr:\n\n-Professional swimmer\n\n-dives into water and air(especially during matches)\n\n-Rich kid",
            "Mesut Ozil:\n\n-World Cup winner\n\n-Won a world cup for germany but isnt respected there\n\n-Everything was fine until he signed for arsenal",
            "Sergio Ramos:\n\n-Best Defender\n\n-Most red cards but still best defender\n\n-Most number of yellow cards but still best defender"

    };

    final String[] emailIds = {
            "cr7@cr7.com", "mohithvarmais@gmail.com",
            "zlatan@heaven.com", "messi@barcaAlways.com",
            "neymar@swimmingPool.com", "ozilStuck@arsenal.com",
            "ramos@bestDefender.com"
    };

    int currentImageIndex = 0;
    int currentNameIndex = 0;
    int ind;

    public int getImage()
    {
        return images[getArrayIndexForImage()];
    }

    public String getName()
    {
        return names[getArrayIndexForName()];
    }

    public int getIndex()
    {
        return  currentNameIndex;
    }

    private int getArrayIndexForImage()
    {
        currentImageIndex++;
        if(currentImageIndex == 7)
        {
            currentImageIndex = 0;
        }
        return currentImageIndex;
    }
    private int getArrayIndexForName()
    {
        currentNameIndex++;
        if(currentNameIndex == 7)
        {
            currentNameIndex = 0;
        }
        ind = currentNameIndex;
        return currentNameIndex;
    }

    public String getDescription(int index)
    {
        return listOfDescriptions[index];
    }

    public String getEmailId(int index)
    {
        return emailIds[index];
    }
}
