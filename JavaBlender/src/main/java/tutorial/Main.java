package tutorial;
abstract class Sorcerer {
    private String name;
    private CursedTechnique technique;
    abstract public String cast();
}

class CursedTechnique{
    private String name;
    private String domainExpansion;

    public CursedTechnique(String name, String domainExpansion) {
        this.name = name;
        this.domainExpansion = domainExpansion;
    }

    public String revealTechnique(){
        return this.name;
    }
    public void useDomain(){
        System.out.println("Domain Expansion! :"+this.domainExpansion);
    }
}
class CursedSpirit extends Sorcerer {

    public CursedSpirit(String name, String cursedTechnique) {
        super();
    }

    @Override
    public String cast() {
        return "Idle Transfiguration";
    }
}

class SpecialGrade extends Sorcerer{

    @Override
    public String cast() {
        return "Hollow purple!";
    }
}
public class Main {

    public static void main(String[] args) {
        Sorcerer mahito = new CursedSpirit("name","Self - Embodiement of Perfection");
        System.out.println(mahito.cast());
    }
}
