package Core;

import Core.abstracts.GoogleService;
import GoogleRegister.GoogleManager;

public class GoogleManagerAdapter implements GoogleService {
    @Override
    public void registerToSystem() {

        GoogleManager googleManager = new GoogleManager();
        googleManager.register();

    }
}
