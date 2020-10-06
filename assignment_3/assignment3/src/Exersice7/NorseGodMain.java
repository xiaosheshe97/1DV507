package Exersice7;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

import java.util.ArrayList;

public class NorseGodMain extends Application {
    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        ArrayList<NorseGods> norseGods = new ArrayList<>();
        norseGods.add(new NorseGods("Loki","Giant","Loki's relation with the gods varies " +
                "by source; Loki sometimes assists the gods and sometimes behaves in a malicious manner towards " +
                "them. Loki is a shape shifter and in separate incidents he appears in the form of a salmon," +
                " a mare, a fly, and possibly an elderly woman named Þökk (Old Norse 'thanks'). Loki's positive " +
                "relations with the gods end with his role in engineering the death of the god Baldr and Loki is" +
                " eventually bound by Váli with the entrails of one of his sons. In both the Poetic Edda and the" +
                " Prose Edda, the goddess Skaði is responsible for placing a serpent above him while he is bound." +
                " The serpent drips venom from above him that Sigyn collects into a bowl; however, she must empty" +
                " the bowl when it is full, and the venom that drips in the meantime causes Loki to writhe in pain, " +
                "thereby causing earthquakes. With the onset of Ragnarök, Loki is foretold to slip free from his " +
                "bonds and to fight against the gods among the forces of the jötnar, at which time he will encounter" +
                " the god Heimdallr and the two will slay each other."));
        norseGods.add(new NorseGods("Heimdallr","Aesir","In Norse mythology, Heimdallr is " +
                "a god who possesses the resounding horn Gjallarhorn, owns the golden-maned horse Gulltoppr, is " +
                "called the shining god and the whitest of the gods, has gold teeth, and is the son of Nine Mothers" +
                " (who may represent personified waves). Heimdallr is attested as possessing foreknowledge, keen " +
                "eyesight and hearing, and keeps watch for invaders and the onset of Ragnarök while drinking fine " +
                "mead in his dwelling Himinbjörg, located where the burning rainbow bridge Bifröst meets the sky. " +
                "Heimdallr is said to be the originator of social classes among humanity and once regained Freyja's " +
                "treasured possession Brísingamen while doing battle in the shape of a seal with Loki. Heimdallr and" +
                " Loki are foretold to kill one another during the events of Ragnarök. Heimdallr is additionally " +
                "referred to as Rig, Hallinskiði, Gullintanni, and Vindlér or Vindhlér.\n" +
                "Heimdallr is attested in the Poetic Edda, compiled in the 13th century from earlier traditional " +
                "material; in the Prose Edda and Heimskringla, both written in the 13th century by Snorri Sturluson; " +
                "in the poetry of skalds; and on an Old Norse runic inscription found in England. Two lines of an " +
                "otherwise lost poem about the god, Heimdalargaldr, survive. Due to the problematic and enigmatic " +
                "nature of these attestations, scholars have produced various theories about the nature of the god, " +
                "including his apparent relation to rams, that he may be a personification of or connected to the world" +
                " tree Yggdrasil, and potential Indo-European cognates."));
        norseGods.add(new NorseGods("Odin","Aesir","Odin appears as a prominent god throughout " +
                "the recorded history of the Germanic peoples, from the Roman occupation of regions of Germania " +
                "(from c.  12 BCE) through the tribal expansions of the Migration Period (4th to 6th centuries CE) " +
                "and the Viking Age (8th to 11th centuries CE). In the modern period the rural folklore of Germanic " +
                "Europe continued to acknowledge Odin. References to him appear in place names throughout regions " +
                "historically inhabited by the ancient Germanic peoples, and the day of the week Wednesday bears " +
                "his name in many Germanic languages, including in English."));
        norseGods.add(new NorseGods("Thor","Asir","Thor is a prominently mentioned god throughout " +
                "the recorded history of the Germanic peoples, from the Roman occupation of regions of Germania, " +
                "to the tribal expansions of the Migration Period, to his high popularity during the Viking Age, " +
                "when, in the face of the process of the Christianization of Scandinavia, emblems of his hammer, " +
                "Mjölnir, were worn and Norse pagan personal names containing the name of the god bear witness to " +
                "his popularity."));
        norseGods.add(new NorseGods("Baidr","Asir","The god of light, joy, purity, beauty," +
                " innocence, and reconciliation. Son of Odin and Frigg, he was loved by both gods and men and was " +
                "considered to be the best of the gods. He had a good character, was friendly, wise and eloquent, " +
                "although he had little power.His wife was Nanna daughter of Nep, and their son was Forseti, the " +
                "god of justice. Balder's hall was Breidablik (\"broad splendor\"). Nanna is linked with the " +
                "Sumerian goddess Inanna."));
        norseGods.add(new NorseGods("Freyir","Vanir","Freyr (Old Norse: Lord), sometimes " +
                "anglicized as Frey, is a widely attested god in Norse mythology, associated with sacral kingship," +
                " battle, virility, peace and prosperity, with sunshine and fair weather, and with good harvest. " +
                "Freyr, sometimes referred to as Yngvi-Freyr, was especially associated with Sweden and seen as an " +
                "ancestor of the Swedish royal house. According to Adam of Bremen, Freyr was associated with peace " +
                "and pleasure, and was represented with a phallic statue in the Temple at Uppsala. According to " +
                "Snorri Sturluson, Freyr was \"the most renowned of the æsir\", and was venerated for good harvest " +
                "and peace."));
        norseGods.add(new NorseGods("Freyia","Vanir","Freyja rules over her heavenly field, " +
                "Fólkvangr, where she receives half of those who die in battle. The other half go to the god Odin's " +
                "hall, Valhalla. Within Fólkvangr lies her hall, Sessrúmnir. Freyja assists other deities by " +
                "allowing them to use her feathered cloak, is invoked in matters of fertility and love, and is " +
                "frequently sought after by powerful jötnar who wish to make her their wife. Freyja's husband, " +
                "the god Óðr, is frequently absent. She cries tears of red gold for him, and searches for him under" +
                " assumed names. Freyja has numerous names, including Gefn, Hörn, Mardöll, Sýr, Valfreyja, and Vanadís."));
        norseGods.add(new NorseGods("Bragi","Aesir","Bragi is generally associated with bragr, " +
                "the Norse word for poetry. The name of the god may have been derived from bragr, or the term bragr" +
                " may have been formed to describe 'what Bragi does'. A connection between the name Bragi and Old " +
                "English brego 'chieftain' has been suggested but is generally now discounted. A connection between" +
                " Bragi and the bragarfull 'promise cup' is sometimes suggested, as bragafull, an alternate form of " +
                "the word, might be translated as 'Bragi's cup'. See Bragarfull."));
        norseGods.add(new NorseGods("Tyr","Aesir","Týr is the namesake of the Tiwaz rune (ᛏ), " +
                "a letter of the runic alphabet corresponding to the Latin letter T. By way of the process of " +
                "interpretatio germanica, the deity is the namesake of Tuesday ('Týr's day') in Germanic " +
                "languages, including English. Interpretatio romana, in which Romans interpreted other gods " +
                "as forms of their own, generally renders the god as Mars, the ancient Roman war god, and it is " +
                "through that lens that most Latin references to the god occur. For example, the god may be " +
                "referenced as Mars Thingsus (Latin 'Mars of the Thing') on 3rd century Latin inscription, " +
                "reflecting a strong association with the Germanic thing, a legislative body among the ancient " +
                "Germanic peoples."));

        BorderPane pane = new BorderPane();
        pane.setPadding(new Insets(10,10,10,10));

        Text top = new Text("Norse Gods and other Beings");
        top.setFont(Font.font(30));
        pane.setTop(top);

        ListView<String> gods = new ListView<>();
        gods.setPrefWidth(150);
        for (NorseGods g: norseGods){
            gods.getItems().add(g.getName());
        }
        pane.setLeft(gods);

        Text name = new Text();
        name.setFont(Font.font(20));
        Text race = new Text();
        Text desc = new Text();
        TextFlow textFlow = new TextFlow(name,race,desc);

        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(textFlow);
        scrollPane.setFitToWidth(true);
        scrollPane.setPadding(new Insets(5,5,5,5));
        pane.setCenter(scrollPane);


        gods.getSelectionModel().selectedIndexProperty().addListener(ov ->{
            name.setText(norseGods.get(gods.getSelectionModel().getSelectedIndex()).getName()+"\n");
            race.setText(norseGods.get(gods.getSelectionModel().getSelectedIndex()).getRace()+"\n\n");
            desc.setText(norseGods.get(gods.getSelectionModel().getSelectedIndex()).getDesc());
        });

        Scene scene = new Scene(pane,500,300);
        primaryStage.setTitle("Norse Gods");
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
