import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Authorization {
    public File usersFile = new File("src/userFile");


    public boolean authorization(File usersFile) {
        writeToFile(usersFile);
        return false;
    }


    public void registration() {
        try {
            if (!usersFile.createNewFile()) {
                usersFile.createNewFile();
            } else {
                authorization(usersFile);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void writeToFile(File usersFile) {
        try {
            FileWriter writer = new FileWriter(usersFile, true);
            writer.write(Client.logintext.getText());
            writer.write("\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void writeToFilePassword(File usersFile){
        try {
            FileWriter writer = new FileWriter(usersFile, true);
            writer.write(Client.passwordText.getPassword());
            writer.write("\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void isAuthorized() {
        if (!authorization(usersFile)) {
            registration();
        }

    }


}
