System.config({
    map: {
        'ng2-drag-drop': 'node_modules/ng2-drag-drop',
        'ng2-popup':'node_modules/ng2-popup/dist',
        'ng2-overlay':'node_modules/ng2-overlay/dist'
    },
    packages: {
     'ng2-drag-drop':  { main: 'index.js',  defaultExtension: 'js' },
      'ng2-popup':{ main: 'ng2-popup.umd.js', defaultExtension: 'js'},
      'ng2-overlay':{ main: 'ng2-overlay.umd.js', defaultExtension: 'js' }
    }
});