read input_dir
read output_dir
find $input_dir -type f -name "*.txt" | while read file; do
  filename=$(basename "$file")
  destination="$output_dir/$filename"
  
  if [ -f "$destination" ]; then
    counter=1
    while [ -f "$destination" ]; do
      new_filename="${filename%.*}_$counter.${filename##*.}"
      destination="$output_dir/$new_filename"
      ((counter++))
    done
  fi
  
  cp "$file" "$destination"
done
