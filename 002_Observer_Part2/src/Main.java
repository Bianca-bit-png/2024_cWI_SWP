;
import com_example_newsbroker.NewsAgency;
import com_example_newsbroker.NewsChannel;

public class Main {
    public static void main(String[] args) throws Exception{
        //instantiate the news Agencys
        var apa = new com_example_newsbroker.NewsAgency("APA");
        var reuters = new com_example_newsbroker.NewsAgency("Reuters");

        //instantiate the news channels
        var orf = new com_example_newsbroker.NewsChannel("orf.at");
        var nzz = new com_example_newsbroker.NewsChannel("nzz.ch");
        var nytimes = new com_example_newsbroker.NewsChannel("nytimes.com");

        //subscribe to APA
        apa.subscribe(orf);
        apa.subscribe(nzz);

        //subscribe to Reuters
        reuters.subscribe(nytimes);
        reuters.subscribe(nzz);

        //broadcast news
        apa.broadcast("Auf der Suche nach der nächsten Registrierung");
        reuters.broadcast("Harrus campaign raises $55 mln over two weekend eventsy, campaign official says");
    }

}