/*
 * This Java source file was generated by the Gradle 'init' task.
 */

import static spark.Spark.*;


/** 
 * <h1>Tic Tac Toe</h1>
 * This is the business code of our solution
 * 
 * @since 22-10-2017
*/
public class TicServer {
    String board = "";

    private static int getHerokuPort() {
        ProcessBuilder psb = new ProcessBuilder();
        if (psb.environment().get("PORT") != null) {
            return Integer.parseInt(psb.environment().get("PORT"));
        }
        return 4567;
    }

    private void init(){
        get(
            "/mark/:field", 
            (req, res) -> mark(req.params(":field"))
        );
    }

    private String mark(String field){
        return field;
    }

    public static void main(String[] args) {
        staticFileLocation("/public");
        port(getHerokuPort());

        TicServer server = new TicServer();
        server.init();
        
    }
}