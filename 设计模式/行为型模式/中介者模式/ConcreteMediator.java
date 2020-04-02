package 设计模式.行为型模式.中介者模式;


import java.util.ArrayList;
import java.util.List;

/**
 * 具体中介者
 */
public class ConcreteMediator extends Mediator {

    private List<Colleague> colleagues = new ArrayList<>();

    @Override
    void register(Colleague colleague) {
        if(!colleagues.contains(colleague)){
            colleagues.add(colleague);
            colleague.setMedium(this);
        }
    }

    @Override
    void relay(Colleague colleague) {
        for (Colleague co: colleagues) {
            if(!co.equals(colleague)){
                ((Colleague)co).receive();
            }
        }
    }
}
