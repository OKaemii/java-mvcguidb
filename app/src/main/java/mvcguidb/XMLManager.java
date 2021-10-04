package mvcguidb;

// this is for a student xml, and not a general xml manager
public class XMLManager {
    private String path = "";

    public XMLManager(String path){
        this.path = path;
    }

    public Integer save(){
        // make sure xml file exists
        //    if not, create new xml
        // stream xml file
        // rewrite xml file
        // end stream
        // return -1 if fail, else 0
        return null;
    }

    public Integer load(){
        // stream xml file
        // atomise student objects
        // write out student details separated by comma
        // end stream
        // return -1 if fail, else 0
        return null;
    }
}
