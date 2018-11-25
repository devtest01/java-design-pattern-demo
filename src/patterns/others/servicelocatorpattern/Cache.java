package patterns.others.servicelocatorpattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cache {
    private Map<String, Service> serviceMap;

    public Cache() {
        serviceMap = new HashMap<>();
    }

    public Service getService(String serviceName) {
        if (serviceMap.containsKey(serviceName)) {
            System.out.println("Returning cached " + serviceName + " object.");
            return serviceMap.get(serviceName);
        }
        return null;
    }

    public void addService(Service newService) {
        if (!serviceMap.containsKey(newService.getName())) {
            serviceMap.put(newService.getName(), newService);
        }
    }
}
