public class Movie
{
    // class variables
    private String title;
    private String studio;
    private String rating;
    
    // three-arguments constructor implementation
    public Movie(String aTitle, String aStudio, String aRating)
    {
        title = aTitle;
        studio = aStudio;
        rating = aRating;
    }
    
    // two-arguments constructor implementation
    public Movie(String aTitle, String aStudio)
    {
        title = aTitle;
        studio = aStudio;
        rating = "PG";
    }
    
    // getPG method implementation
    public Movie[] getPG(Movie[] movies)
    {
        Movie[] pgRatings = new Movie[movies.length];
        
        for(int i = 0, j = 0; i < movies.length; i++)
        {
            if(movies[i].rating.equalsIgnoreCase("PG"))
            {
                pgRatings[j] = movies[i];
                j++;
            }
        }
        
        return pgRatings;        
    }
    
    // toString method implementation
    public String toString()
    {
        return "Title: " + title + "\nStudio: " + studio + "\nRating: " + rating;
    }
} // end of Movie class

 



// MovieTest class implementation
class MovieTest {
    public static void main(String[] args)
    {
        // create an object for Movie class
        Movie m = new Movie("Casino Royale", "Eon Productions", "PG-13");
        
        // display the details of Movie
        System.out.println(m);
    }
} 