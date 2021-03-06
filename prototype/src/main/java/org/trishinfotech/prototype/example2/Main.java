package org.trishinfotech.prototype.example2;

import org.trishinfotech.prototype.Color;
import org.trishinfotech.prototype.FillPattern;
import org.trishinfotech.prototype.LinePattern;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		Circle circle = new Circle();
		circle.setX(10);
		circle.setY(10);
		ShapeStyle circleStyle = new ShapeStyle();
		circleStyle.setLineColor(Color.BLUE);
		circleStyle.setLinePattern(LinePattern.DOT);
		circleStyle.setLineThickness(1.1d);
		FillStyle circleFillStyle = new FillStyle();
		circleFillStyle.setFillColor(Color.YELLOW);
		circleFillStyle.setFillPattern(FillPattern.HEART);
		circle.setStyle(circleStyle);
		circle.setFillStyle(circleFillStyle);

		System.out.println("Drawing original object");
		System.out.println("-------------------------------------------------------------------------");
		circle.draw();
		System.out.println("Making clone of original object");
		Circle deepCopyCircle = circle.clone();
		System.out.println("Drawing clone object");
		System.out.println("-------------------------------------------------------------------------");
		deepCopyCircle.draw();
		System.out.println("Modifying clone object");
		deepCopyCircle.setX(20);
		deepCopyCircle.getStyle().setLineColor(Color.RED);
		deepCopyCircle.getFillStyle().setFillPattern(FillPattern.CHECKS);
		System.out.println("\n\nDrawing original object");
		System.out.println("-------------------------------------------------------------------------");
		circle.draw();
		System.out.println("Drawing clone object");
		System.out.println("-------------------------------------------------------------------------");
		deepCopyCircle.draw();
	}

}
