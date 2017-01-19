import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * Created by rubenvarela on 1/17/17.
 */
public class Circle {
    public double radius;
    public int getObjectCount;

    public Circle(double radius) {
        this.radius = radius;
        getObjectCount++;
    }
    public double getCircumference() {
        return (2 * Math.PI) * radius;
    }
    public String getFormattedCircumference() {
        return formatNumber(getCircumference());
    }
    public double getArea() {
        return Math.PI * (radius * radius);
    }
    public String getFormattedArea() {
        return formatNumber(getArea());
    }
    private String formatNumber(double value) {
        DecimalFormat df = new DecimalFormat("#.##");
        return df.format(value);
    }
}
