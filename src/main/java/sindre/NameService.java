package sindre;


import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NameService {
    private List<String> flickNamn;
    private List<String> pojkNamn;
    private List<String> efterNamn;
    private Randomizer randomizer = new Randomizer();

    public NameService()  {
        this.flickNamn = createNameList("flicknamn.txt");
        this.pojkNamn = createNameList("pojknamn.txt");
        this.efterNamn = createNameList("efternamn.txt");
    }

    private List createNameList(String fileName) {
        List<String> result = new ArrayList<>();
        try (Stream<String> lines = Files.lines(Paths.get(fileName))) {
            result = lines.collect(Collectors.toList());
        } catch(IOException e){
            e.printStackTrace();
        }
        return result;
    }

    public String getRandomFlicknamn(){
        return flickNamn.get(randomizer.randomNumber(flickNamn.size()));
    }

    public String getRandomPojknamn(){
        return pojkNamn.get(randomizer.randomNumber(pojkNamn.size()));
    }

    public String getRandomEfternamn(){
        return efterNamn.get(randomizer.randomNumber(efterNamn.size()));
    }

    public List<String> getFlickNamn() {
        return flickNamn;
    }


}
