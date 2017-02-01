package com.atomist.rug.commands.doit;

import com.atomist.rug.kind.service.ServicesMutableView;
import com.atomist.rug.spi.Command;
import com.atomist.util.lang.JavaScriptArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class DoItCommands implements Command<ServicesMutableView> {

    @Override
    public Set<String> nodeTypes() {
        return Collections.singleton("services");
    }

    @Override
    public String name() {
        return "doit";
    }

    @Override
    public Object invokeOn(ServicesMutableView treeNode) {
        return new DoItOperations();
    }

    public static class DoItOperations {

        public List<String> doit() {
            List<String> result = new ArrayList<>();
            result.add("hello, Rug command world");

            return new JavaScriptArray<>(result);
        }
    }
}
