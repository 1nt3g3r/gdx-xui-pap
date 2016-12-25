package ua.com.integer.gdx.xml.ui.pap.imp;

import ua.com.integer.gdx.powerful.assets.PowAssets;
import ua.com.integer.gdx.xml.ui.res.AssetProvider;

public class TextureAtlasProvider implements AssetProvider {
    @Override
    public Object getAsset(String name) {
        return PowAssets.access().getAtlas(name);
    }
}
