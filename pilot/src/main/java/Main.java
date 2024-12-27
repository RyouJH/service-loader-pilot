import com.inspien.cepaas.svc.api.RandomInt;

import java.util.Iterator;
import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args)throws Exception {
        RandomInt randomInt = load(RandomInt.class);
        System.out.println(randomInt.random());
    }

    protected static <T> T load(Class<T> clazz) throws InstantiationException {
        ServiceLoader<T> loader = ServiceLoader.load(clazz);
        Iterator<T> it = loader.iterator();
        while (it.hasNext()) {
            return it.next();
        }
        throw new InstantiationException(clazz.getCanonicalName());
    }
}
