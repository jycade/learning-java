package 设计模式.行为型模式.访问者模式Visitor;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
