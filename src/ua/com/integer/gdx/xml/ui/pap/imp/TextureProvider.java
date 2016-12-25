package ua.com.integer.gdx.xml.ui.pap.imp;

import com.badlogic.gdx.graphics.Texture;

import ua.com.integer.gdx.powerful.assets.PowAssets;
import ua.com.integer.gdx.xml.ui.res.AssetProvider;

public class TextureProvider implements AssetProvider {
    @Override
    public Object getAsset(String name) {
        String textureName = name;
        Texture.TextureFilter textureFilter = Texture.TextureFilter.Linear;

        if (name.contains("->")) {
            String[] parts = name.split("->");
            textureName = parts[0];
            textureFilter = Texture.TextureFilter.valueOf(parts[1]);
        }

        Texture texture = PowAssets.access().getTexture(textureName);
        texture.setFilter(textureFilter, textureFilter);
        return texture;
    }
}
