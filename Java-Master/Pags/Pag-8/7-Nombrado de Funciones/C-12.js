function showCount (count) {
    // si cout es undefined o null, muestra "unknown"
    console.log (conunt ?? "unkownd");
}

showCount (0); // 0
showCount (null) ; // unknown
showCount () ; // unknown
