VERSION=`cat ./gradle.properties | grep "VERSION_NAME"`
echo "Current version: $VERSION"
TAG_NAME="v$VERSION"
echo "Tag name: $TAG_NAME"
echo "TAG_NAME=$TAG_NAME" >> "$GITHUB_ENV"
