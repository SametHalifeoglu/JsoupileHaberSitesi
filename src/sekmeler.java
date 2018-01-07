
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.DefaultListModel;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class sekmeler {

    ArrayList<HashMap<String, String>> ls = new ArrayList<>();
    DefaultListModel<String> dlm = new DefaultListModel<>();
    HashMap<String, String> hm = new HashMap<>();

    public DefaultListModel AnaSayfa(String urldegeri) {
        String url = urldegeri;
        dlm.clear();
        try {
            Document doc = (Document) Jsoup.connect(url).get();
            Elements elm = doc.getElementsByAttributeValue("class", "ui-list");
            Elements elm1 = elm.tagName("li");
            Elements elm3 = elm1.select("a");
            Elements elm4 = elm3.select("img");
            for (Element item : elm3) {
                dlm.addElement(item.attr("title"));
                Elements a = item.select("img");
                String img = a.attr("src");
                hm.put(item.attr("title"), img);
            }
            System.out.println("hm degeri:" + hm);

        } catch (IOException e) {
            System.err.println("Hata Alıyorum sekmeler sayfasındayım : " + e.getMessage());
        }
        return dlm;
    }

}
