int extracted() {
  var i = 0;
  var j = i + 239;
  i = j - 1;
  return i;
}

main() {
  var i = extracted();
  return i + 10;
}