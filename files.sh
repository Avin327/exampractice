read -p "Enter the directory path: " dir_path

if [ -d "$dir_path" ]; then
  echo "Directory $dir_path exists."
else
  mkdir -p "$dir_path"
  echo "Directory $dir_path created."
fi