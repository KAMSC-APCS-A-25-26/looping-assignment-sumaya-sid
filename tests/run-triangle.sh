#!/bin/bash

echo "🧪 Running Number Triangle Pattern Tests..."

# Make sure we're in the right directory
cd "$(dirname "$0")/.."

# Run only NumberTrianglePattern tests
echo "📋 Running Number Triangle Pattern tests..."
mvn -q test -Dtest=NumberTrianglePatternTest

if [ $? -eq 0 ]; then
    echo "✅ All Number Triangle Pattern tests passed! Great job!"
else
    echo "❌ Some Number Triangle Pattern tests failed. Check your implementation."
    exit 1
fi
