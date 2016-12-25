package ua.com.integer.gdx.xml.ui.pap.imp;

import ua.com.integer.gdx.powerful.assets.PowAssets;
import ua.com.integer.gdx.xml.ui.res.AssetProvider;

public class TextureRegionProvider implements AssetProvider {
    @Override
    public Object getAsset(String name) {
        String[] parts = name.split("->");
        String atlas = parts[0];
        String region = parts[1];
        return PowAssets.access().getRegion(atlas, region);
    }
}
