package countries;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 * Created by rubenvarela on 1/23/17.
 */
public class CountriesTextFile {
    public void createFile() throws  IOException {
        String dirString = "src/countries";
        String fileString = "countries.txt";
        Path filePath = Paths.get(dirString, fileString);
        if (Files.notExists(filePath)) {
            Files.createFile(filePath);
        }
    }
    public void readCountries() throws IOException {
        ArrayList<String> countries = new ArrayList<>();
        Path countriesPath = Paths.get("src/countries/countries.txt");
        File countriesFile = countriesPath.toFile();
        try {
            FileReader r = new FileReader(countriesFile);
            BufferedReader in = new BufferedReader(r);
            String line = in.readLine();
            while (line != null) {
                countries.add(line);
                System.out.println(line);
                line = in.readLine();
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    public void writeCountries(String userCountries) {
        String[] countries = {userCountries};

        Path filePath = Paths.get("src/countries/countries.txt");
        File countriesFilePath = filePath.toFile();

        try {
            PrintWriter out = new PrintWriter(countriesFilePath);
            for (String country : countries) {
                out.println(country);
            }
            out.close();
        } catch (IOException e) {
            System.out.println(e);

        }
    }
}
