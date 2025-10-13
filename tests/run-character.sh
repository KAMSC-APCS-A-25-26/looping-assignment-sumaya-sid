#!/bin/bash

echo "🧪 Running Character Per Line Tests..."

# Make sure we're in the right directory
cd "$(dirname "$0")/.."

# Run only CharacterPerLine tests
echo "📋 Running Character Per Line tests..."
mvn -q test -Dtest=CharacterPerLineTest

if [ $? -eq 0 ]; then
    echo "✅ All Character Per Line tests passed! Great job!"
else
    echo "❌ Some Character Per Line tests failed. Check your implementation."
    exit 1
fi
