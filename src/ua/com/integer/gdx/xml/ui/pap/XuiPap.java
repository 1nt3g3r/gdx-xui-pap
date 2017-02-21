package ua.com.integer.gdx.xml.ui.pap;

import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;

import ua.com.integer.gdx.xml.ui.XUI;
import ua.com.integer.gdx.xml.ui.pap.imp.BitmapFontProvider;
import ua.com.integer.gdx.xml.ui.pap.imp.MusicProvider;
import ua.com.integer.gdx.xml.ui.pap.imp.SkinProvider;
import ua.com.integer.gdx.xml.ui.pap.imp.SoundProvider;
import ua.com.integer.gdx.xml.ui.pap.imp.TextureAtlasProvider;
import ua.com.integer.gdx.xml.ui.pap.imp.TextureProvider;
import ua.com.integer.gdx.xml.ui.res.XUIAssets;

public class XuiPap {
    public static void init() {
        XUIAssets assets = XUI.assets();
        assets.registerAssetProvider(Music.class, new MusicProvider());
        assets.registerAssetProvider(Sound.class, new SoundProvider());
        assets.registerAssetProvider(TextureAtlas.class, new TextureAtlasProvider());
        assets.registerAssetProvider(Texture.class, new TextureProvider());
        assets.registerAssetProvider(BitmapFont.class, new BitmapFontProvider());
        assets.registerAssetProvider(Skin.class, new SkinProvider());
    }
}
