import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        genericClass<?> gc ; //ဒီcode မှာအကုန် အဆင်ပြေပြီး generic wild card ထည့်လိုက်မှသာ required: CAP#1, found: String ဆိုပြီး error တက်နေပါတယ်။ ဘာကြောင့်တက်တာလဲ။ အဲ့လိုရေးလို့မရဘူးလား ခင်ဗျ။
        gc = new genericClass<String>();
        gc.add("re");
        System.out.println(Arrays.toString(gc.getAll()));
    }
}

class genericClass<T> {

    @SuppressWarnings("unchecked")
    T[] array = (T[])new Object[0];

    public void add(T input) {
        array = Arrays.copyOf(array, array.length+1);
        array[array.length - 1] = input;
    }

    public T[] getAll() {
        return Arrays.copyOf(array, array.length);
    }
}
