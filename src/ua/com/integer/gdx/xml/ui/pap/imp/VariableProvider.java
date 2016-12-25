package ua.com.integer.gdx.xml.ui.pap.imp;

import com.badlogic.gdx.utils.ObjectMap;

import ua.com.integer.gdx.xml.ui.res.AssetProvider;

public class VariableProvider implements AssetProvider {
    private ObjectMap<String, String> variables = new ObjectMap<String, String>();

    public void set(String name, String value) {
        variables.put(name, value);
    }

    @Override
    public Object getAsset(String name) {
        return variables.get(name);
    }
}
