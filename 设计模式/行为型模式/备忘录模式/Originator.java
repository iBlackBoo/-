package 设计模式.行为型模式.备忘录模式;

/**
 * 发起人
 */
public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    Memento createMemento(){
        return new Memento(this.state);
    }

    void restoreMemento(Memento memento){
        this.setState(memento.getState());
    }

}
