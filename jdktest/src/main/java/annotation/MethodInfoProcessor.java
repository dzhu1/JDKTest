package annotation;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Messager;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;

import com.google.auto.service.AutoService;

@AutoService(javax.annotation.processing.Processor.class)
@SupportedAnnotationTypes({ "annotation.MethodInfo" })
public class MethodInfoProcessor extends AbstractProcessor {

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment env) {
        Map<String,String> map = new HashMap<String,String>();
        Messager messager = processingEnv.getMessager();
        messager.printMessage(Diagnostic.Kind.MANDATORY_WARNING, "PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP");
        
        for (TypeElement te : annotations){
            for (Element element : env.getElementsAnnotatedWith(te)){
                MethodInfo methodInfo = element.getAnnotation(MethodInfo.class);
                map.put(element.getEnclosingElement().toString(), methodInfo.author());
                

//                messager.printMessage(Diagnostic.Kind.ERROR, "TTTTTTTTTTTTTTTT");
            }
        }
        
        return false;
    }

}
