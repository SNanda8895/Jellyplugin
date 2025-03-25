package io.jenkins.plugins.sample;

import hudson.model.Action;
import hudson.model.RootAction;
import jenkins.model.Jenkins;
import org.kohsuke.stapler.Stapler;
import org.kohsuke.stapler.StaplerProxy;
import org.kohsuke.stapler.StaplerRequest;

public class HelloWorldAction implements RootAction{
    private String name;

    public HelloWorldAction(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    @Override
    public String getIconFileName() {
        return null;
    }

    @Override
    public String getDisplayName() {
        return "Greeting";
    }

    @Override
    public String getUrlName() {
        return "greeting";
    }

}
