package run;

import server.Server;
import user.User;

public class Run {
    private User user;
    private Server server;

    public Run(){
        this.user = new User(1);
        this.server = new Server();
    }

    public void Start(){
        this.server.run(this.user.getTask());
    }
}
