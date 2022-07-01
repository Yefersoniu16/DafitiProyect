package co.com.sistecredito.certification.dafiti.tasks;

import co.com.sistecredito.certification.dafiti.models.RegisterModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.sistecredito.certification.dafiti.userinterfaces.Register.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.List;


import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class RegisterUserPage implements Task {


    public RegisterUserPage(List<RegisterModel> registerUser) {
        this.registerUser = registerUser;
    }

    private List<RegisterModel> registerUser;


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(BTN_MEN, isVisible()).forNoMoreThan(15).seconds(),
                Click.on(BTN_MEN),
                Click.on(BTN_NEW),
                Click.on(BTN_PAIS),
                Click.on(BTN_HOMBRE)

        );
        System.out.println(registerUser.get(0).getFirstname());
    }

    public static RegisterUserPage register(List<RegisterModel> registerUser) {
        return instrumented(RegisterUserPage.class, registerUser);
    }
}
