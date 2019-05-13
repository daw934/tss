package pl.dawid.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class RandomService {

    public String generateRandomNumber() {
        int random = new Random().ints(1, 10)
                .findAny()
                .getAsInt();
        return Integer.toString(random);
    }

    public List<Integer> generateRandomNumbers() {
        return new Random().ints(10, 1, 10)
                .boxed()
                .collect(Collectors.toList());
    }

}
