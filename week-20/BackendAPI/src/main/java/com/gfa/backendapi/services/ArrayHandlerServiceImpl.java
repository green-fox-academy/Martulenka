package com.gfa.backendapi.services;

import com.gfa.backendapi.models.ArrayHandler;
import com.gfa.backendapi.models.ErrorMessage;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ArrayHandlerServiceImpl implements ArrayHandlerService{

    @Override
    public List<Integer> getResultList(ArrayHandler arrayHandler){
        return arrayHandler.getNumbers().stream().map(no -> no*2).collect(Collectors.toList());
    }

    @Override
    public Integer getResultInteger(ArrayHandler arrayHandler){
        if(arrayHandler.getWhat().contains("sum") ){
            return arrayHandler.getNumbers().stream().mapToInt(Integer::intValue).sum();
        }else if(arrayHandler.getWhat().contains("multiply")){
            return arrayHandler.getNumbers().stream().reduce(1, (a, b) -> a * b);
        }else{
            return null;
        }
    }


    @Override
    public ErrorMessage getError(String what, List<Integer> numbers) {
        if (what == null && numbers == null) {
            return new ErrorMessage("Please provide what to do and the numbers!");
        }
        else if (what == null) {
            return new ErrorMessage("Please provide what to do with the numbers!");
        }
        else if (numbers == null) {
            return new ErrorMessage("Please provide the numbers!");
        }
        return new ErrorMessage();
    }

}
