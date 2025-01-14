package com.quicklink.easyml

import org.extism.sdk.manifest.Manifest;
import org.extism.sdk.wasm.UrlWasmSource;
import org.extism.sdk.Plugin;
import org.extism.sdk.wasm.PathWasmSource

fun main() {
    val url = "https://github.com/extism/plugins/releases/latest/download/count_vowels.wasm";
    var manifest =  Manifest(listOf(UrlWasmSource.fromUrl(url)));
    var plugin =  Plugin(manifest, false, null);

    var output = plugin.call("count_vowels", "Hello, World!");
    println(output);


    manifest =  Manifest(listOf(PathWasmSource(null, "C:\\Users\\mehillid\\Documents\\extism\\plugin\\dist\\plugin.wasm", null)));
    plugin =  Plugin(manifest, true, null);

    output = plugin.call("greet", "Denis");
    println(output);

}


