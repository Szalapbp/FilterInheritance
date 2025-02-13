import java.awt.*;

public class BigRectangleFilter implements Filter
{
    @Override
    public boolean accept(Object x)
    {
        if(x instanceof Rectangle)
        {
            Rectangle rectangle = (Rectangle)x;
            int perimeter = 2 * (rectangle.width + rectangle.height);
            return perimeter > 10;
        }
        return false;
    }
}
