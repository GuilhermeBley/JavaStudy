package br.com.abc.javacore.Oexception.superscript.test;

import br.com.abc.javacore.Oexception.superscript.clas.Employee;
import br.com.abc.javacore.Oexception.superscript.clas.Person;

import javax.security.auth.login.LoginException;

public class SuperScriptWithExceptionTest {
    public static void main(String[] args) throws LoginException {
        Employee employee = new Employee();
        Person person = new Person();

        employee.Save();

    }
}
